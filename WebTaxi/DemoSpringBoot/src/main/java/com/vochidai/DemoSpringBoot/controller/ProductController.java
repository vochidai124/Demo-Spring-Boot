//package com.vochidai.DemoSpringBoot.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    private List<Product> productList = new ArrayList<>();
//
//    // GET /products
//    @GetMapping
//    public List<Product> getAllProducts() {
//        return productList;
//    }
//
//    // GET /products/{id}
//    @GetMapping("/{id}")
//    public Product getProductById(@PathVariable int id) {
//        // Tìm sản phẩm theo ID và trả về
//        for (Product product : productList) {
//            if (product.getId() == id) {
//                return product;
//            }
//        }
//        // Trả về null nếu không tìm thấy sản phẩm
//        return null;
//    }
//
//    // POST /products
//    @PostMapping
//    public ResponseEntity<String> addProduct(@RequestBody Product product) {
//        // Thêm sản phẩm mới vào danh sách
//        productList.add(product);
//        // Trả về thông báo thành công và ID của sản phẩm mới
//        return ResponseEntity.ok("Product added successfully. ID: " + product.getId());
//    }
//
//    // PUT /products/{id}
//    @PutMapping("/{id}")
//    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
//        // Tìm sản phẩm theo ID và cập nhật thông tin
//        for (Product product : productList) {
//            if (product.getId() == id) {
//                product.setName(updatedProduct.getName());
//                product.setPrice(updatedProduct.getPrice());
//                return ResponseEntity.ok("Product updated successfully.");
//            }
//        }
//        // Trả về thông báo lỗi nếu không tìm thấy sản phẩm
//        return ResponseEntity.badRequest().body("Product not found.");
//    }
//
//    // DELETE /products/{id}
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
//        // Xóa sản phẩm theo ID
//        for (Product product : productList) {
//            if (product.getId() == id) {
//                productList.remove(product);
//                return ResponseEntity.ok("Product deleted successfully.");
//            }
//        }
//        // Trả về thông báo lỗi nếu không tìm thấy sản phẩm
//        return ResponseEntity.badRequest().body("Product not found.");
//    }
//}
