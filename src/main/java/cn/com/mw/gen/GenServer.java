package cn.com.mw.gen;

import cn.com.mw.app.framework.develop.config.CodegenProperties;
import cn.com.mw.app.framework.develop.core.engine.CodegenBuilder;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;

import javax.annotation.Resource;

/**
 * @author : ly
 * 自动代码生成启动类
 **/
public class GenServer implements ApplicationRunner {

    @Resource
    private CodegenProperties codegenProperties;
    @Resource
    private CodegenBuilder codegenBuilder;

    public static void main(String[] args) {
        SpringApplication.run(GenServer.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        codegenBuilder.generationCodes(codegenProperties.getTableName());
    }

}
