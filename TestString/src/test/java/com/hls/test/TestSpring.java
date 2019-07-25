package com.hls.test;

        import com.hls.beans.Girl;
        import com.hls.beans.Pay;
        import com.hls.beans.PrettyGirl;
        import org.junit.Test;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public void test01(){
        /*获取上下文对象，Spring声明的对象都要上下文对象获取*/
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");

        Girl girl = (Girl) ctx.getBean("girl");
        System.out.println(girl);
        ((PrettyGirl)girl).show();

    }

    @Test
    public void test02(){
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pay pay = (Pay)ctx1.getBean("pay");
        pay.pay();
    }

    @Test
    public void test03(){
        ApplicationContext ctx2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pay alibabapay = (Pay) ctx2.getBean("aLiBaBaPay");
        alibabapay.pay();
    }
}