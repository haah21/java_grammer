package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.logging.LoggingPermission;

//중요 중요 중요 중요
public class C0602Calendar {
    public static void main(String[] args) {
        //java.util 패키지의 calendar 클래스 //안씀
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH)+1);
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));

        //java.time 피키지 : Local~ 클래스
        //날짜(Local date)-MariaDB:date, 시간(LocalTime), 날짜와 시간(LocalDateTime) - MariaDB : datetime

//        LocalDate presentDate = LocalDate.now();
//        System.out.println(presentDate);
//        System.out.println(presentDate.getYear());
//        System.out.println(presentDate.getMonth());
//        System.out.println(presentDate.getDayOfMonth());
//        System.out.println(presentDate.getDayOfWeek());
//
//        LocalTime presentTime = LocalTime.now();
//        System.out.println(presentTime);
//        System.out.println(presentTime.getHour());
//        System.out.println(presentTime.getMinute());
//        System.out.println(presentTime.getSecond());

        //위에거 다 안씀 이거만 쓰면 됨
        LocalDateTime presentDateTime = LocalDateTime.now();
        System.out.println(presentDateTime);
        System.out.println(presentDateTime.getYear());
        System.out.println(presentDateTime.getHour());

        //임의로 특정시간을 만들어 내고 싶을때 : of메서드 사용
        LocalDate birthDay = LocalDate.of(1999,12,27);
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());

        LocalTime birthTime = LocalTime.of(20,20,20);

        LocalDateTime birthDayTime = LocalDateTime.of(1999,12,27,20,20,20);
        // 매개변수로 크로노필드 enum타입 사용하여 프로그램의 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthDayTime.get(ChronoField.HOUR_OF_DAY));
        //0 : 오전 1: 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
        myWatch(LocalDateTime.now(),ChronoField.YEAR);
        myWatch(LocalDateTime.now(),ChronoField.AMPM_OF_DAY);

    }


    //왜 크로노 필드 쓰는가?
    static void myWatch(LocalDateTime localDateTime, ChronoField c){
        //System.out.println(localDateTime.get(c));
        if(c==ChronoField.YEAR){
            System.out.println("연도는 "+localDateTime.get(c)+" 입니다.");
        }else if(c==ChronoField.MONTH_OF_YEAR){
            System.out.println("월은 " + localDateTime.get(c) + " 입니다.");
        } else if (c == ChronoField.AMPM_OF_DAY) {
            if (localDateTime.get(c) == 0){
                System.out.println("오전입니다.");
            }else {
                System.out.println("오후입니다");
            }

        }
    }
}
