package com.smarthousebuilder.wishlistItem;

import com.smarthousebuilder.marketplace.wishlistItem.WishlistItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistItemRepository extends JpaRepository<WishlistItems,Integer> {

    Boolean existsByWishlistIdAndAndProductId(Integer wishlistId, Integer productId);

    WishlistItems findAllByWishlistId(Integer wishlistId);
}
