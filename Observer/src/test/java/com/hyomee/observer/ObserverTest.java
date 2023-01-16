package com.hyomee.observer;

import com.hyomee.observer.service.observers.side.EconomicReading;
import com.hyomee.observer.service.observers.side.SportsReading;
import com.hyomee.observer.service.subject.News;
import com.hyomee.observer.vo.NewVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(
        classes = {News.class, SportsReading.class, EconomicReading.class}
)
public class ObserverTest {

    @Autowired
    private News news;

    @Test
    public void runNews() {

        news.writingNews(NewVO.builder()
                .subject("스프츠는 살아 있다.")
                .side("스포츠")
                .contents("스포츠는 살아 있다......")
                .build());

        news.writingNews(NewVO.builder()
                .subject("한국 경제의 현실")
                .side("경제")
                .contents("한국 경제의 현실은 암담하다......")
                .build());
    }
}
