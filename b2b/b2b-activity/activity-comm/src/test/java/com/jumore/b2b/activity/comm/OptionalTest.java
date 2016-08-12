package com.jumore.b2b.activity.comm;
import org.junit.Test;

import com.google.common.base.Optional;


public class OptionalTest {
    
    @Test
    public void testOptional() throws Exception { 
        Optional<Integer> possible=Optional.of(6);
        Optional<Integer> absentOpt=Optional.absent();
        Optional<Integer> NullableOpt=Optional.fromNullable(null);
        Optional<Integer> NoNullableOpt=Optional.fromNullable(10);
        if(possible.isPresent()){
            System.out.println("possible isPresent:"+possible.isPresent());
            System.out.println("possible value:"+possible.get());
        }
        if(absentOpt.isPresent()){
            System.out.println("absentOpt isPresent:"+absentOpt.isPresent()); ;
        }
        if(NullableOpt.isPresent()){
            System.out.println("fromNullableOpt isPresent:"+NullableOpt.isPresent()); ;
        }
        if(NoNullableOpt.isPresent()){
            System.out.println("NoNullableOpt isPresent:"+NoNullableOpt.isPresent()); ;
        }
        String  name=null;
        name = Optional.fromNullable(name).or("火星人");
    	System.out.println("文艺青年说：Hello, "+name);
    	
    	name="王小非";
        name = Optional.fromNullable(name).or("火星人");
    	System.out.println("文艺青年说：Hello, "+name);
    	

    } 
}