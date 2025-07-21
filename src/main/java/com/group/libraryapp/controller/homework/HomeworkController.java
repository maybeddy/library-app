package com.group.libraryapp.controller.homework;

import com.group.libraryapp.dto.homework.request.Homework1Request;
import com.group.libraryapp.dto.homework.request.Homework2Request;
import com.group.libraryapp.dto.homework.request.Homework3Request;
import com.group.libraryapp.dto.homework.response.Homework1Response;
import com.group.libraryapp.dto.homework.response.Homework2Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
public class HomeworkController {

    @GetMapping("/homework1")
    public Homework1Response homework1(Homework1Request request){
        return new Homework1Response(request.getNum1() + request.getNum2(), request.getNum1() - request.getNum2(), request.getNum1() * request.getNum2());
    }

    @GetMapping("/homework2")
    public Homework2Response homework2(Homework2Request request){
        String dayOfWeek = request.getDate().getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();

        return new Homework2Response(dayOfWeek);
    }

    @PostMapping("/homework3")
    public int homework3(@RequestBody Homework3Request request){
        return request.getNumbers().stream().reduce(0, Integer::sum);
    }
}
