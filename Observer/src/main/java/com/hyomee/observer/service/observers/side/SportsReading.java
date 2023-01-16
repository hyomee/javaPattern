package com.hyomee.observer.service.observers.side;

import com.hyomee.observer.service.observers.NewsReading;
import com.hyomee.observer.service.observers.Observer;
import com.hyomee.observer.service.subject.News;
import com.hyomee.observer.vo.NewVO;
import org.springframework.stereotype.Service;

@Service
public class SportsReading implements Observer, NewsReading {

    private final String SIDE_SPORT = "스포츠";
    private NewVO newVO;
    private News news;

    public SportsReading(News news) {
        this.news = news;
        news.registerObserver(this);
    }

    @Override
    public void update(NewVO newVO) {
        this.newVO = newVO;
        read();
    }

    @Override
    public void update() {
        newVO = news.getNewVO();
        read();
    }

    @Override
    public void read() {
        if ( SIDE_SPORT.equals(newVO.getSide()) ) {
            System.out.println(String.format("**** %s **** \n * 제목 : %s \n * 내용 : %s ",
                    newVO.getSide(),
                    newVO.getSubject(),
                    newVO.getContents()) );
        } else {
            System.out.println(String.format("**** %s **** \n  ", SIDE_SPORT ) );
        }
    }
}
