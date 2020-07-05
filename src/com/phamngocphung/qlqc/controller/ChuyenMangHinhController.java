/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phamngocphung.qlqc.controller;

import com.phamngocphung.qlqc.bean.DanhMucBeAn;
import com.phamngocphung.qlqc.view.KhachHangJPanel;
import com.phamngocphung.qlqc.view.banggiaJPanel;
import com.phamngocphung.qlqc.view.hopdongJPanel;
import com.phamngocphung.qlqc.view.phuongtienquancaoJPanel;
import com.phamngocphung.qlqc.view.trangchujpanel;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author NGOC PHUNG
 */
public class ChuyenMangHinhController {
    private JPanel Root;
    private String kindSelected =" ";
    List<DanhMucBeAn> listItem =null;

    public ChuyenMangHinhController(JPanel jpanel) {
        this.Root = jpanel;
    }
    
    public void setView(JPanel jpnItem ,JLabel jblItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96, 100, 191));
        jblItem.setBackground(new Color(96, 100, 191));
        Root.removeAll();
        Root.setLayout(new BorderLayout());
        Root.add(new trangchujpanel());
        Root.validate();
        Root.repaint();
    }
  public void setEven(List<DanhMucBeAn> listItem){  
     this.listItem = listItem;
     for (DanhMucBeAn item : listItem) {
           item.getJlb().addMouseListener(new labelEven(item.getKind(), item.getJpn(), item.getJlb()));
     }
      
  }
    class labelEven implements MouseListener{
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public labelEven(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }  
        
        

        @Override
        public void mouseClicked(MouseEvent me) {
            switch(kind){
                case "TrangChu":
                node = new trangchujpanel();
                break;
                case "khachhang":
                node = new KhachHangJPanel();
                break;
                case "banggia":
                node = new banggiaJPanel();
                break;
                 case "hopdong":
                node = new hopdongJPanel();
                break;
                 case "phuongtienquancao":
                node = new phuongtienquancaoJPanel();
                break;
                default:
                node = new trangchujpanel();

                    break;
                             
            }
        Root.removeAll();
        Root.setLayout(new BorderLayout());
        Root.add(node);
        Root.validate();
        Root.repaint();
        setchangeBackgroud(kind);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        kindSelected = kind;
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent me) {
         
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent me) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(76, 175, 80));
                 jlbItem.setBackground(new Color(76, 175, 80));
            }
        }
        
    }
private void setchangeBackgroud(String kind){
     for (DanhMucBeAn item : listItem) {
          if (item.getKind().equalsIgnoreCase(kind)) {
             item.getJpn().setBackground(new Color(96, 100, 191));
             item.getJlb().setBackground(new Color(96, 100, 191));
         }
          else{
            item.getJpn().setBackground(new Color(76, 175, 80));
            item.getJlb().setBackground(new Color(76, 175, 80));
            }
        }
    }   
}
