package uz.pdp.springframeworkcore;

import org.springframework.context.annotation.Bean;

public class MyBean2 {

    private final MyBean myBean;

    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }

    public void hi(){
        System.out.println("MyBean2");
        myBean.hi();
    }

    @Bean
    public MyBean2 getMyBean2(MyBean myBean) {
        return new MyBean2(myBean);
    }
}
