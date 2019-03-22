package cn.keking.service;

import org.springframework.ui.Model;

/**
 * Created by hejianhui on 2018/12/17.
 * Content :
 */
public interface FilePreview {
    String filePreviewHandle(String url,String fileType, Model model);
}
