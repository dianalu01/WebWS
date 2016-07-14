package com.admazing.core.contracts;

import java.util.List;

import com.admazing.CouponBookModel;

public interface CouponBookRepository {
	List<CouponBookModel> getAllById(String idUser);
	boolean save(String idUser,String idPromotion);
	boolean deletePromotion(String idUser,String idPromotion);
}
