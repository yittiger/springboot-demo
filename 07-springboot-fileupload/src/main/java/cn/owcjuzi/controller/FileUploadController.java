package cn.owcjuzi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * spring boot文件上传
 */
@RestController
public class FileUploadController {

    /**
     *
     * @param filename 参数名必须和上传的输入框name一致
     * @return
     * @throws IOException
     */
    @PostMapping("/fileUpload")
    public Map<String, Object> fileUpload(MultipartFile filename) throws IOException {
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("f:/upload/" + filename.getOriginalFilename()));
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "文件上传成功");
        return map;
    }
}
