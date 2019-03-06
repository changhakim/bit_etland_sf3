package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;

@Repository
public class ImageMapperImpl implements ImageMapper{

	@Override
	public void insertImage(ImageDTO img) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ImageDTO> selectimageList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageDTO> selectImage(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageDTO lastImageSeq() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageDTO selectImage(ImageDTO img) {
		// TODO Auto-generated method stub
		return null;
	}

}
