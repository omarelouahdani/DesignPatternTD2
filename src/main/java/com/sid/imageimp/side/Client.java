package com.sid.imageimp.side;

public class Client {
    public void main(String... arr) throws Exception{
        Frimwork f=Frimwork.getInstece();
        String className="com.sid.ImageTraitmentImp";
        Class c=Class.forName(className);

        f.setTelnet((ImageTraitment) c.newInstance());
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
