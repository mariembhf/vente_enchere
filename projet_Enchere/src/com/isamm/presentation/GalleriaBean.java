package com.isamm.presentation;

import java.awt.Image;
import java.util.ArrayList;  
import java.util.Collection;
import java.util.Iterator;
import java.util.List;  
import java.util.ListIterator;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="galleriaBean")
@SessionScoped

public class GalleriaBean {
	  
	    private List<String> images;  
	    //private List<Image> listImage;
	  
	    @PostConstruct  
	    public void init() {  
	        images = new List<String>() {

				@Override
				public boolean add(String e) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public void add(int index, String element) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public boolean addAll(Collection<? extends String> c) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean addAll(int index, Collection<? extends String> c) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public void clear() {
					// TODO Auto-generated method stub
					
				}

				@Override
				public boolean contains(Object o) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean containsAll(Collection<?> c) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public String get(int index) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public int indexOf(Object o) {
					// TODO Auto-generated method stub
					return 0;
				}

				@Override
				public boolean isEmpty() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public Iterator<String> iterator() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public int lastIndexOf(Object o) {
					// TODO Auto-generated method stub
					return 0;
				}

				@Override
				public ListIterator<String> listIterator() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public ListIterator<String> listIterator(int index) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public boolean remove(Object o) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public String remove(int index) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public boolean removeAll(Collection<?> c) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean retainAll(Collection<?> c) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public String set(int index, String element) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return 0;
				}

				@Override
				public List<String> subList(int fromIndex, int toIndex) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public Object[] toArray() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public <T> T[] toArray(T[] a) {
					// TODO Auto-generated method stub
					return null;
				}
			};
	        
	        //listImage=new ArrayList<>();
	        
	        System.out.println("dans constructeur");
	  
	        /*for(int i=1;i<=6;i++) {  
	        	
	            images.add(i + ".jpg");  
	          
	            
	        }  */
	        
	       
	        
	    }  
	  
	    public List<String> getImages() {  
	        return images;  
	    }  
	    
	    
	    public void listImages()
	    {
	    	    images = new  List<String>() {
					
					@Override
					public <T> T[] toArray(T[] a) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Object[] toArray() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List<String> subList(int fromIndex, int toIndex) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public int size() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public String set(int index, String element) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public boolean retainAll(Collection<?> c) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeAll(Collection<?> c) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public String remove(int index) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public boolean remove(Object o) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public ListIterator<String> listIterator(int index) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public ListIterator<String> listIterator() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public int lastIndexOf(Object o) {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public Iterator<String> iterator() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public boolean isEmpty() {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public int indexOf(Object o) {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public String get(int index) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public boolean containsAll(Collection<?> c) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean contains(Object o) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public void clear() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public boolean addAll(int index, Collection<? extends String> c) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean addAll(Collection<? extends String> c) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public void add(int index, String element) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public boolean add(String e) {
						// TODO Auto-generated method stub
						return false;
					}
				};
	    	   
		        
		        //listImage=new ArrayList<>();
		        
		        System.out.println("dans methode: list image");
		  
		        /*for(int i=1;i<=6;i++) {  
		           
		        	try
		        	{
		        		System.out.println("dans itération + "+i);
		        		images.add(i, i + ".jpg");
			 	        //images.add(i + ".jpg");  
			           
		        	}
		        	catch(Exception e)
		        	{
		        		System.out.println(e.toString());
		        	}
		        	
		            
		        }  
		        
		        for(int j=1;j<images.size();j++)
		        {
		        	 System.out.println(images.get(j).toString());
		        }*/
		        
		        
		       
		        try
	        	{
		        	this.images.add("/images/1.jpg");
		        	this.images.add("/images/2.jpg");
		        	this.images.add("/images/3.jpg");
		        	this.images.add("/images/4.jpg");
		        	this.images.add("/images/5.jpg");
		        	this.images.add("/images/6.jpg");
				    
				    System.out.println("images ajoutées avec succès");
		           
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println(e.toString());
	        	}
	        	
		        
		        
	    }
} 
	
	

