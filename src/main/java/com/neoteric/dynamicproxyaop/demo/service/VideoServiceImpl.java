package com.neoteric.dynamicproxyaop.demo.service;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public void addVideo(String title) {
        System.out.println("Adding video: " + title);
    }

    @Override
    public void deleteVideo(String title) {
        System.out.println("Deleting video: " + title);
    }
}
