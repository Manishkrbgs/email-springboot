package com.omkar.GetApiandMailIntegration;

import org.springframework.context.annotation.Bean;

//configuration will also create a object of the class it is written above so dont need to specially make a object as this also contains component class in itself so i have also used a component class indirectly
@org.springframework.context.annotation.Configuration
public class Configuration {

    // Define beans for the objects you want to create this is basically an objecct made by spring it self
    @Bean
    public MyObject myObject() {
        String name = "manish";
        int age = 22;
        return new MyObject(name, age);
    }


}

