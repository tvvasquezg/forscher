/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class Tree<T> implements Collection{

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class TNodo<T>{
    private T info;
    private TNodo<T> left;
    private TNodo<T> right;
    protected Comparator<T> comparador;

    TNodo(T info) {
      this(info, null, null);
    }

    TNodo(T info, TNodo<T> l, TNodo<T> r) {
      this.info = info;
      left = l;
      right = r;
    }

    T getInfo() {
      return info;
    }

    TNodo<T> getLeft() {
      return left;
    }

    TNodo<T> getRight() {
      return right;
    }

    void setInfo(T info) {
      this.info = info;
    }

    void setLeft(TNodo<T> left) {
      this.left = left;
    }

    void setRight(TNodo<T> right) {
      this.right = right;
    }

    void insert(TNodo<T> tree, int side) {
      if (side == tree.left.size()) {
        if (left == null) {
          left = tree;
        } else {
          System.out.println("Existe un árbol no vacío");
        }
      } else if (side == tree.right.size()) {
        if (right == null) {
          right = tree;
        } else {
          System.out.println("Existe un árbol no vacío");
        }
      } else {
        System.out.println("Tamaño Incorrecto");
      }
    }

   /* TNodo<T> extract(int side) {
      TNodo<T> tree;
      if (side == left.size()) {
        tree = left;
        left = null;
      } else if (side == right.size()) {
        tree = right;
        right = null;
      } else {
        System.out.println("Incorrect side");
      }
      return tree;
    }
*/
    int size() {
      int size = 1;
      if (left != null) {
        size += left.size();
      }
      if (right != null) {
        size += right.size();
      }
      return size;
    }

    int height() {
      int hl = -1;
      int hr = -1;
      if (left != null) {
        hl = left.height();
      }
      if (right != null) {
        hr = right.height();
      }
      return 1 + Math.max(hl, hr);
    }

    void PreOrder() {
      System.out.println(info);
      if (left != null) {
        left.PreOrder();
      }
      if (right != null) {
        right.PreOrder();
      }
    }

    void InOrder() {
      if (left != null) {
        left.InOrder();
      }
      System.out.println(info);
      if (right != null) {
        right.InOrder();
      }
    }

    void PostOrder() {
      if (left != null) {
        left.PostOrder();
      }
      if (right != null) {
        right.PostOrder();
      }
      System.out.println(info);
    }
  }
}
