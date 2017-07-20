package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//url:  http://localhost:8080/HelloSpringMVC/hello/mvc

//����DispatcherServlet��ص������� ����һ��Controller��
@Controller  

//�༶���RequestMapping������DispatcherServlet������ฺ����URL��
//HandlerMapping���������ǩ������
@RequestMapping(value="/hello")  
public class HelloController {
		
	//���������RequestMapping�� ���Ʋ���С��URL·��ƥ�䣬ͬ�༶��ı�ǩЭͬ����������ȷ�����ص���URL���Ǹ���������
	//��ָ�����ʷ���ΪGET
	  @RequestMapping(value="/mvc",method=RequestMethod.GET)  
	    public String HelloWorld(Model model){  
		  
	        model.addAttribute("message","Hello Spring MVC!!!");  //��������ǰ��
	        
	      //��ͼ��Ⱦ��/WEB-INF/view/HelloWorld.jsp
	        return "HelloWorld";  //ҳ������ƣ����ݴ��ַ�����ȥѰ����ΪHelloWorld.jsp��ҳ��
	    }  
}