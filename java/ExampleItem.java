package com.group_2_BSIT_3D_NS.pinasarap;

public class ExampleItem {

    private int img_resource;
    private String text;


    public ExampleItem (int img_res, String catdesc) {
        img_resource=img_res;
        text=catdesc;
    }

    public int getImg_resource() {
        return img_resource;
    }

    public String getText(){
        return text;
    }
}
