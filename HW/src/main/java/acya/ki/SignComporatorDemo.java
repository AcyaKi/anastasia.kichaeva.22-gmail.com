package acya.ki;

import acya.ki.bean.SignComporatorBean;
import acya.ki.service.SignComporator;

public class SignComporatorDemo {
    public static void main(String[] args) {
        SignComporatorBean signComporatorOne = new SignComporatorBean(1);
        SignComporatorBean signComporatorTwo = new SignComporatorBean(-5);
        SignComporatorBean signComporatorThree = new SignComporatorBean(0);
        SignComporator signComporator = new SignComporator();
        signComporator.compare(signComporatorOne);
        signComporator.result(signComporatorOne);


    }
}

