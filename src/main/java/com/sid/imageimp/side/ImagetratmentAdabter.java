package com.sid.imageimp.side;

public class ImagetratmentAdabter extends ImageTraitment{

    NonStondarImagetraitment nonStondarImagetraitment=new NonStondarImagetraitment();
    @Override
    public int[] traiter(int[] image) {
        int[][] img=new int[image.length/2][image.length/2];
        for(int i=0;i<img.length;++i){
            for(int j=0;j<img.length;++j){
                img[i][j]=image[i+j];
            }
        }
        img=nonStondarImagetraitment.treter(img);
        int[] im=new int[img.length*img.length];
        for(int i=0;i<img.length;++i){
            for(int j=0;j<img.length;++j){
                im[i+j]=img[i][j];
            }
        }
        return im;
    }
}
