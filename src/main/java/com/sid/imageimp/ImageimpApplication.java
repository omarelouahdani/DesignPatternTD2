package com.sid.imageimp;

import com.sid.imageimp.side.Frimwork;
import com.sid.imageimp.side.ImageTraitment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ImageimpApplication {

    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("IOConfiguration.xml");
        ImageTraitment imageTraitment= (ImageTraitment) context.getBean("d");
        Frimwork f=Frimwork.getInstece();
        f.setTelnet(imageTraitment);
        int[] im=new int[10];
        for(int i=0;i<im.length;i++){
            im[i]=50;
        }
        int[] m=f.telnet.traiter(im);
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }

    }


}
