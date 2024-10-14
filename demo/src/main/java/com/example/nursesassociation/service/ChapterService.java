package com.example.nursesassociation.service;

import com.example.nursesassociation.model.Chapter;
import com.example.nursesassociation.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    public List<Chapter> getAllChapters() {
        return chapterRepository.findAll();
    }

    public Chapter saveChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    public Chapter getChapterById(Long id) {
        return chapterRepository.findById(id).orElseThrow(() -> new RuntimeException("Chapter not found"));
    }
}
