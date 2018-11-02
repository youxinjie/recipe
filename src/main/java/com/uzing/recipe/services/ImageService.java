package com.uzing.recipe.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Xinjie on 2018/11/1 9:25 PM.
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
