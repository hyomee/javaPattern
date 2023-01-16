package com.hyomee.observer.service.subject;

import com.hyomee.observer.service.observers.Observer;
import com.hyomee.observer.vo.NewVO;
import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class News implements Subject {

    private List<Observer> observers;
    private NewVO newVO;

    public News() {
        observers = new ArrayList<>();
    }

    // 옵져버 등록
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // 옵저버 삭제
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // 옵저버들에게 통보
    @Override
    public void notifyObserver() {
        for ( Observer observer : observers ) {
            // push
            // observer.update(newVO);

            // pull
            observer.update();
        }
    }

    // 상태 변화를 발행
    public void published() {
        notifyObserver();
    }

    // 뉴스 상태 변경
    public void writingNews(NewVO newVO) {
        this.newVO = newVO;
        published();
    }

}
