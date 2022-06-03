package com.timwang5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@RestController
public class FileController {

    //��ʽһ
    //@RequestParam("file") ��name=file�ؼ��õ����ļ���װ��CommonsMultipartFile ����
    //�����ϴ�CommonsMultipartFile��Ϊ���鼴��
    @RequestMapping("/upload1")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //��ȡ�ļ��� : file.getOriginalFilename();
        String uploadFileName = file.getOriginalFilename();

        //����ļ���Ϊ�գ�ֱ�ӻص���ҳ��
        if ("".equals(uploadFileName)) {
            return "redirect:/index.jsp";
        }
        System.out.println("�ϴ��ļ��� : " + uploadFileName);

        //�ϴ�·����������
        String path = request.getServletContext().getRealPath("/upload");
        //���·�������ڣ�����һ��
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        System.out.println("�ϴ��ļ������ַ��" + realPath);

        InputStream is = file.getInputStream(); //�ļ�������
        OutputStream os = new FileOutputStream(new File(realPath, uploadFileName)); //�ļ������

        //��ȡд��
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
            os.flush();
        }
        os.close();
        is.close();
        return "redirect:/index.jsp";
    }





    /*  ��ʽ��
     * ����file.Transto �������ϴ����ļ�
     */
    @RequestMapping("/upload2")
    public String  fileUpload2(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //�ϴ�·����������
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if (!realPath.exists()){
            realPath.mkdir();
        }
        //�ϴ��ļ���ַ
        System.out.println("�ϴ��ļ������ַ��"+realPath);

        //ͨ��CommonsMultipartFile�ķ���ֱ��д�ļ���ע�����ʱ��
        file.transferTo(new File(realPath +"/"+ file.getOriginalFilename()));

        return "redirect:/index.jsp";
    }



    @RequestMapping(value="/download")
    public String downloads(HttpServletResponse response , HttpServletRequest request) throws Exception{
        //Ҫ���ص�ͼƬ��ַ
        String path = request.getServletContext().getRealPath("/upload");
        String fileName = "�����﷨.jpg";

        //1������response ��Ӧͷ
        response.reset(); //����ҳ�治����,���buffer
        response.setCharacterEncoding("UTF-8"); //�ַ�����
        response.setContentType("multipart/form-data"); //�����ƴ�������
        //������Ӧͷ
        response.setHeader("Content-Disposition",
                "attachment;fileName="+ URLEncoder.encode(fileName, "UTF-8"));

        File file = new File(path,fileName);
        //2�� ��ȡ�ļ�--������
        InputStream input=new FileInputStream(file);
        //3�� д���ļ�--�����
        OutputStream out = response.getOutputStream();

        byte[] buff =new byte[1024];
        int index=0;
        //4��ִ�� д������
        while((index= input.read(buff))!= -1){
            out.write(buff, 0, index);
            out.flush();
        }
        out.close();
        input.close();
        return null;
    }




}
