'use strict'

const util = require('util')
const mysql = require('mysql')
const db = require('./db')

const productsCtrl = {
    get: (req, res) => {
        let sql = 'SELECT * FROM phim'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    gettheloai: (req, res) => {
        let sql = 'SELECT * FROM theloai'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    getuser: (req, res) => {
        let sql = 'SELECT * FROM user'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    postuser: (req, res) => {
        let data = req.body;
        let sql = 'INSERT INTO user SET ?'
        db.query(sql, [data], (err, response) => {
            if (err) throw err
            res.send({ message: 'Insert success!' })
        })
    },
    deleteuser: (req, res) => {
        let sql = 'DELETE FROM user WHERE idUser = ?'
        db.query(sql, [req.params.idUser], (err, response) => {
            if (err) throw err
            res.send({ message: 'Delete success!' })
        })
    },
    updateuser: (req, res) => {
        let data = req.body;
        let idUser = req.params.idUser;
        let sql = 'UPDATE user SET ? WHERE idUser = ?'
        db.query(sql, [data, idUser], (err, response) => {
            if (err) throw err
            res.json({message: 'Update success!'})
        })
    },
    getphimtheloai1: (req, res) => {
        let sql = 'SELECT * FROM phim WHERE idTheloai = 1'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    getphimtheloai2: (req, res) => {
        let sql = 'SELECT * FROM phim WHERE idTheloai = 2'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    getphimtheloai3: (req, res) => {
        let sql = 'SELECT * FROM phim WHERE idTheloai = 3'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    getphimtheloai4: (req, res) => {
        let sql = 'SELECT * FROM phim WHERE idTheloai = 4'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    getphimtheloai5: (req, res) => {
        let sql = 'SELECT * FROM phim WHERE idTheloai = 5'
        db.query(sql, (err, response) => {
            if (err) console.log(err)
            res.send(response)
        })
    },
    ktuser: (req, res) => {
        let sql = 'SELECT * FROM user WHERE TKUser = ?'
        db.query(sql, [req.params.TKUser], (err, response) => {
            if (err) throw err
            res.json(response[0])
        })
    },
    kttheloai: (req, res) => {
        let sql = 'SELECT * FROM phim WHERE idTheloai = ?'
        db.query(sql, [req.params.idTheloai], (err, response) => {
            if (err) throw err
            res.json(response[0])
        })
    },
    postphim: (req, res) => {
        let data = req.body;
        let sql = 'INSERT INTO phim SET ?'
        db.query(sql, [data], (err, response) => {
            if (err) throw err
            res.send({ message: 'Insert success!' })
        })
    },
    posttheloai: (req, res) => {
        let data = req.body;
        let sql = 'INSERT INTO theloai SET ?'
        db.query(sql, [data], (err, response) => {
            if (err) throw err
            res.send({ message: 'Insert success!' })
        })
    },
    deletetheloai: (req, res) => {
        let sql = 'DELETE FROM theloai WHERE idTheloai = ?'
        db.query(sql, [req.params.idTheloai], (err, response) => {
            if (err) throw err
            res.send({ message: 'Delete success!' })
        })
    },
    updatetheloai: (req, res) => {
        let data = req.body;
        let idTheloai = req.params.idTheloai;
        let sql = 'UPDATE theloai SET ? WHERE idTheloai = ?'
        db.query(sql, [data, idTheloai], (err, response) => {
            if (err) throw err
            res.json({message: 'Update success!'})
        })
    }
    
}

module.exports = productsCtrl;