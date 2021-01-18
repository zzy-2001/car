package com.jk.service;

import com.jk.pojo.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class Hystrix implements CarService{
    @Override
    public List<TreeBean> findtree() {
        return null;
    }

    @Override
    public HashMap<String, Object> findCar(Integer page, Integer rows, CarBean bean) {
        return null;
    }

    @Override
    public List<CarBean> findType() {
        return null;
    }

    @Override
    public List<CarBean> findColor() {
        return null;
    }

    @Override
    public void addCar(CarBean bean) {

    }

    @Override
    public CarBean findById(Integer id) {
        return null;
    }

    @Override
    public void voipCar(Integer id, String field, Integer biz) {

    }

    @Override
    public void addCol(CarBean bean) {

    }

    @Override
    public void delCol(Integer id) {

    }

    @Override
    public CarBean findByIdCol(Integer id) {
        return null;
    }

    @Override
    public void addTyp(CarBean bean) {

    }

    @Override
    public void delTyp(Integer id) {

    }

    @Override
    public CarBean findByIdTyp(Integer id) {
        return null;
    }

    @Override
    public HashMap<String, Object> findSlo(Integer page, Integer rows, SloBean bean) {
        return null;
    }

    @Override
    public void addSlo(SloBean bean) {

    }

    @Override
    public List<SloBean> findPla() {
        return null;
    }

    @Override
    public SloBean findByIdSlo(Integer id) {
        return null;
    }

    @Override
    public void delSlo(Integer[] arr) {

    }

    @Override
    public void upSta(Integer integer, Integer id) {

    }

    @Override
    public void addPla(SloBean bean) {

    }

    @Override
    public SloBean findByIdPla(Integer id) {
        return null;
    }

    @Override
    public void delPla(Integer id) {

    }

    @Override
    public void upSts(Integer id, Integer status) {

    }

    @Override
    public HashMap<String, Object> findNew(Integer page, Integer rows, NewsBean bean) {
        return null;
    }

    @Override
    public void addNew(NewsBean bean) {

    }

    @Override
    public List<NewsBean> findNty() {
        return null;
    }

    @Override
    public NewsBean findByIdNew(Integer id) {
        return null;
    }

    @Override
    public void delNew(Integer id) {

    }

    @Override
    public void nupSta(Integer id, Integer status) {

    }

    @Override
    public void addNty(NewsBean bean) {

    }

    @Override
    public NewsBean findByIdNty(Integer id) {
        return null;
    }

    @Override
    public void delNty(Integer id) {

    }

    @Override
    public HashMap<String, Object> findOrd(Integer page, Integer rows, OrdBean bean) {
        return null;
    }

    @Override
    public void upOrd(String id, Integer status) {

    }

    @Override
    public List<UserBean> findRol() {
        return null;
    }

    @Override
    public List<UserBean> findBra() {
        return null;
    }

    @Override
    public void addBra(UserBean bean) {

    }

    @Override
    public UserBean findByIdBra(Integer id) {
        return null;
    }

    @Override
    public void delBra(Integer id) {

    }
}
