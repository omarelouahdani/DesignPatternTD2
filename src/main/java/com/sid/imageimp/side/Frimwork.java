package com.sid.imageimp.side;

public class Frimwork {
    public ImageTraitment telnet;
    private static Frimwork frimwork;

    private Frimwork() {
        telnet=new ImageTraitmentImp2();
    }

    public static Frimwork getInstece(){
        if(frimwork==null) frimwork=new Frimwork();
        return frimwork;
    }

    public void setTelnet(ImageTraitment t){
        telnet=t;
    }


}
