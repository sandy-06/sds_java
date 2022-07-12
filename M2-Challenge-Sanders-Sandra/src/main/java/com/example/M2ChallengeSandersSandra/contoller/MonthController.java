package com.example.M2ChallengeSandersSandra.contoller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.M2ChallengeSandersSandra.models.Month;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class MonthController {
 int number;
    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonth(@PathVariable int monthNumber) {
      if(monthNumber < 1 || monthNumber > 12){
          throw new IndexOutOfBoundsException("monthNumber must be between 1 and 12");
        }
      Month month = new Month();
        month.setNumber(monthNumber);
        switch (monthNumber) {
            case 1:
                month.setName("January");
                break;
            case 2:
                month.setName("February");
                break;
            case 3:
                month.setName("March");
                break;
            case 4:
                month.setName("April");
                break;
            case 5:
                month.setName("May");
                break;
            case 6:
                month.setName("June");
                break;
            case 7:
                month.setName("July");
                break;
            case 8:
                month.setName("August");
                break;
            case 9:
                month.setName("September");
                break;
            case 10:
                month.setName("October");
                break;
            case 11:
                month.setName("November");
                break;
            case 12:
                month.setName("December");
                break;
            default:
               throw new IndexOutOfBoundsException("monthNumber must be between 1 and 12");
        }
return month;
    }
    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth() {
        int randomMonth = (int) (Math.random() * 12) + 1;
        Month month = new Month();
        month.setNumber(randomMonth);
        switch (randomMonth) {
            case 1:
                month.setName("January");
                break;
            case 2:
                month.setName("February");
                break;
            case 3:
                month.setName("March");
                break;
            case 4:
                month.setName("April");
                break;
            case 5:
                month.setName("May");
                break;
            case 6:
                month.setName("June");
                break;
            case 7:
                month.setName("July");
                break;
            case 8:
                month.setName("August");
                break;
            case 9:
                month.setName("September");
                break;
            case 10:
                month.setName("October");
                break;
            case 11:
                month.setName("November");
                break;
            case 12:
                month.setName("December");
                break;
            default:
                throw new IndexOutOfBoundsException("monthNumber must be between 1 and 12");
        }
        return month;
    }



}
    

   