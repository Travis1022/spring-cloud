package com.cec.controller;

import com.cec.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by txw on 2018/4/22.
 */

//@RestController 效果等同于@Controller + @ResponseBody
//
//@Controller
//@ResponseBody

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    private Car mCar;

    //http://localhost:8800/springbootdemo/car/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello,Spring Boot!";
    }

    //http://localhost:8800/springbootdemo/car/first
    //http://localhost:8800/springbootdemo/car/second
    @RequestMapping(value = {"/first", "/second"}, method = RequestMethod.GET)
    public String sayHi() {
        return "Hi,Welcome to Spring Boot!";
    }

    //http://localhost:8800/springbootdemo/car/car-info
    @RequestMapping(value = "/car-info", method = RequestMethod.GET)
    public String carProperties() {
        mCar.setCarId(1001);
        mCar.setCarName("本田思域");
        return mCar.toString();
    }

    //http://localhost:8800/springbootdemo/car/my-car-info?id=1001
    @RequestMapping(value = "/my-car-info", method = RequestMethod.GET)
    public String carProperties(@RequestParam("id") Integer carId) {
        mCar.setCarId(carId);
        mCar.setCarName("本田思域");
        return mCar.toString();
    }


    //http://localhost:8800/springbootdemo/car/final-car-info?id=123456
    //http://localhost:8800/springbootdemo/car/final-car-info
    @RequestMapping(value = "/final-car-info", method = RequestMethod.GET)
    public String finalCarProperties(@RequestParam(value = "id", required = false, defaultValue = "0") Integer carId) {
        mCar.setCarId(carId);
        mCar.setCarName("本田思域");
        return mCar.toString();
    }

    //等同于RequestMapping(value = "/get-car-info", method = RequestMethod.GET)
    @GetMapping(value = "/get-car-info")
    public String getCarProperties(@RequestParam(value = "id", required = false, defaultValue = "0") Integer carId,
                                   @RequestParam(value = "carName", required = false, defaultValue = "本田思域") String carName) {
        mCar.setCarId(carId);
        mCar.setCarName(carName);
        return mCar.toString();
    }


}
