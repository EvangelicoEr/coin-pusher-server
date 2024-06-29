package com.tuibi.dianwan.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface FileService {

    String uploadImg(MultipartFile imgFile);

    String uploadImg(InputStream fileStream);

    String generateDirectory();

}
