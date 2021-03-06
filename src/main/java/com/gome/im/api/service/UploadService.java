package com.gome.im.api.service;


import com.gome.im.api.global.Constant.FILE_SUFFIX;
import com.gome.im.api.model.ResultModel;

import java.io.InputStream;

public interface UploadService {

	/**
	 * 上传图片
	 * 
	 * @param input
	 *            输入流
	 * 
	 * @param suffix
	 *            文件后缀名
	 *
	 * @param originalImage
	 *            是否原图
	 * 
	 * */
	ResultModel<Object> uploadImg(InputStream input, FILE_SUFFIX suffix, boolean originalImage);

	/**
	 * 上传语音 Video
	 * 
	 * @param input
	 *            输入流
	 * 
	 * @param suffix
	 *            文件后缀名
	 * 
	 * */
	ResultModel<Object> uploadVoice(InputStream input,FILE_SUFFIX suffix);

	/**
	 * 上传视频
	 * 
	 * @param input
	 *            输入流
	 * 
	 * @param suffix
	 *            文件后缀名
	 * */
	ResultModel<Object> uploadVideo(InputStream input, FILE_SUFFIX suffix);

	/**
	 * 根据内容生成二维码 并上传到tfs
	 *
	 * @param content 二维码内容
	 * @return 返回二维码地址 url
	 */
	String uploadQRCodeImage(String content);

}
