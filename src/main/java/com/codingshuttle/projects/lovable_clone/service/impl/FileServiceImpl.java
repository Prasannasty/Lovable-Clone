package com.codingshuttle.projects.lovable_clone.service.impl;

import com.codingshuttle.projects.lovable_clone.dto.project.FileContentResponse;
import com.codingshuttle.projects.lovable_clone.dto.project.FileNode;
import com.codingshuttle.projects.lovable_clone.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl  implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return null;
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, Long userId) {
        return null;
    }
}
