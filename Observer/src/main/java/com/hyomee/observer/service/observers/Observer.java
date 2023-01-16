package com.hyomee.observer.service.observers;

import com.hyomee.observer.vo.NewVO;

public interface Observer {
    // pull 방식
    void update(NewVO newVO);

    // push 방식
    void update();
}
