
package acya.ki.service;

import acya.ki.SignComporatorDemo;
import acya.ki.bean.SignComporatorBean;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComporatorTest2 {

    @Test
    public void compare() {
        SignComporator signComporator = new SignComporator();
        SignComporatorBean signComporatorBean = new SignComporatorBean();
        SignComporatorDemo signComporatorDemo = new SignComporatorDemo();
        Assert.assertEquals("Number is positive", new SignComporatorBean(1));
 /*       Assert.assertEquals("Number is negative", signComporator.compare(-6));
        Assert.assertEquals("Number = 0", signComporator.compare(0));
*/
    }

}
