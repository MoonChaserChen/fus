package moon.chaser.controller;

import moon.chaser.pojo.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by Allen on 2018/4/29.
 */
@RestController
public class FileController {
    @RequestMapping(value="/upload")
    public AjaxResult upload(@RequestParam(value = "file",required = false) CommonsMultipartFile file) {
        AjaxResult result = new AjaxResult();
        result.setMessage("Hello中文");
        return result;
    }
}
