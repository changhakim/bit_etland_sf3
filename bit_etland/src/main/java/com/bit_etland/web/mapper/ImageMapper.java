package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;

public interface ImageMapper {

	public void insertImage(ImageDTO img);
	public List<ImageDTO> selectimageList(Proxy pxy);
	public List<ImageDTO> selectImage(Proxy pxy);
	public ImageDTO lastImageSeq();
	public ImageDTO selectImage(ImageDTO img);
}
