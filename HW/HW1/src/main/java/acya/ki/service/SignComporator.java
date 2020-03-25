package acya.ki.service;

import acya.ki.bean.SignComporatorBean;

public class SignComporator {
    private SignComporatorBean signComporator;

    public SignComporator() {
    }

    public SignComporatorBean getSignComporatorBean() {
        return signComporator;
    }

    public void setSignComporatorBean(SignComporatorBean signComporator) {
        this.signComporator = signComporator;
    }

    public String compare(SignComporatorBean signComporator) {
        if (signComporator.getNumber() > 0) {
            return ("Number is positive");
        } else if (signComporator.getNumber() < 0) {
            return ("Number is negative");
        } else {
            return ("Number = 0");
        }
    }
    public void result(SignComporatorBean signComporator) {

        if (signComporator.getNumber() > 0) {
            System.out.println("Number " + signComporator.getNumber() + " is positive");
        } else if (signComporator.getNumber() < 0) {
            System.out.println("Number " + signComporator.getNumber() + " is negative");
        } else {
            System.out.println("Number " + signComporator.getNumber() + " is equal to zero");
        }
    }

}

