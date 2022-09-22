package com.lzivan.password;

public class PassCheck {
    private String passone;
    private String passtwo;

    public PassCheck( String newpassone, String newpasstwo){
        setPone(newpassone);
        setPtwo(newpasstwo);
    }

    public String getPassone(){
        return passone;
    }

    public String getPasstwo(){
        return passtwo;
    }

    public void setPone(String newpassone){
        passone = newpassone;
    }

    public void setPtwo(String newpasstwo){
        passtwo = newpasstwo;
    }

    public boolean compare(){
        return (passone.equals(passtwo));
    }
}
