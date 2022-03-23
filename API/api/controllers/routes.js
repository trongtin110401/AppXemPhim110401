'use strict';
// let productsCtrl = require('./controllers/ProductsController');

const express = require('express');
const productsCtrl = require('./ProductsController');

const route = express.Router();

route.get("/phim", productsCtrl.get)
route.post("/phim",productsCtrl.postphim)


route.get("/user",productsCtrl.getuser)
route.get("/user/:TKUser",productsCtrl.ktuser);
route.get("/phim/:idTheloai",productsCtrl.kttheloai);
route.post("/user",productsCtrl.postuser)
route.put("/user/:idUser",productsCtrl.updateuser)
route.delete("/user/:idUser",productsCtrl.deleteuser)


route.delete("/theloai/:idTheloai", productsCtrl.deletetheloai)
route.put("/theloai/:idTheloai", productsCtrl.updatetheloai)
route.get("/theloai", productsCtrl.gettheloai)
route.post("/theloai", productsCtrl.posttheloai)
route.get('/phim/theloai1',productsCtrl.getphimtheloai1)
route.get('/phim/theloai2',productsCtrl.getphimtheloai2)
route.get('/phim/theloai3',productsCtrl.getphimtheloai3)
route.get('/phim/theloai4',productsCtrl.getphimtheloai4)
route.get('/phim/theloai5',productsCtrl.getphimtheloai5)
module.exports = route;

// module.exports = function(app) {
  

//   // todoList Routes
//   app.route('/products')
//     .get(productsCtrl.get)
//     .post(productsCtrl.store);

//   app.route('/products/:productId')
//     .get(productsCtrl.detail)
//     .put(productsCtrl.update)
//     .delete(productsCtrl.delete);
// };
