package com.cg.service.productAvatar;

import com.cg.model.ProductAvatar;
import com.cg.repository.ProductAvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class ProductAvatarServiceImpl implements IProductAvatarService{

    @Autowired
    private ProductAvatarRepository productAvatarRepository;

    @Override
    public List<ProductAvatar> findAll() {
        return null;
    }

    @Override
    public Optional<ProductAvatar> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public ProductAvatar getById(Long id) {
        return null;
    }

    @Override
    public ProductAvatar save(ProductAvatar productAvatar) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
