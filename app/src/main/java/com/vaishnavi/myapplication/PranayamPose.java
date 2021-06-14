package com.vaishnavi.myapplication;

public class PranayamPose {

    int image;
    String poseName;
    String description;
//    String uses;

    public PranayamPose(int image, String poseName , String description ) {
        this.image = image;
        this.poseName = poseName;
        this.description = description;
//        this.uses = uses;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPoseName() {
        return poseName;
    }

    public void setPoseName(String poseName) {
        this.poseName = poseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//
//    public String getUses() {
//        return uses;
//    }
//
//    public void setUses(String description) {
//        this.uses = uses;
//    }

}
