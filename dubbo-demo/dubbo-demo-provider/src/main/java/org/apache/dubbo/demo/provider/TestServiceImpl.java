package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.Test;
import org.apache.dubbo.demo.TestService;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class TestServiceImpl implements TestService {

    /*@Override
    public Test test(String name, Integer age) {
        Test t = new Test();
        t.setAge(age);
        t.setName("duxingxing");
        return t;
    }*/

    @Override
    public Integer test(String name, Integer age) {
        return 5555;
    }
}
