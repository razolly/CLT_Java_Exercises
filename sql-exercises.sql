 ________  ________  ___          
|\   ____\|\   __  \|\  \         
\ \  \___|\ \  \|\  \ \  \        
 \ \_____  \ \  \\\  \ \  \       
  \|____|\  \ \  \\\  \ \  \____  
    ____\_\  \ \_____  \ \_______\
   |\_________\|___| \__\|_______|
   \|_________|     \|__|         
                        
--Worksheet Images:
--https://imgur.com/a/YkXmkdS

--Exercise 1

--1. Write a SQL statement to display all the information of all salesmen.

	SELECT * 
	FROM   salesman;
	
--2. Write a SQL statement to display specific columns like name and commission for all the salesman

	SELECT NAME, 
	       commission 
	FROM   salesman;
	
--3.  Write a SQL statement to display names and city of salesman, who belongs to the city of Paris

	SELECT NAME, 
	       city 
	FROM   salesman 
	WHERE  city = 'Paris';
	
--4. Write a SQL statement to display salesman id, name, city and commission who gets the commission 
--	within the range more than 0.10% and less than 0.12%
	
	SELECT salesman_id, 
	       NAME, 
	       city, 
	       commission 
	FROM   salesman 
	WHERE  commission > 0.10 
	       AND commission < 0.12; 
	       
--5. Write a SQL Statement to find those salesmen with all information who come from
--	the city either Paris or Rome.
	
	SELECT * 
	FROM   salesman 
	WHERE  city IN ( 'Paris', 'Rome' ); 
	
--6
--	???
	
--7.  Write a query to filter those salesmen with all information who likes to leave other
--	cities than Paris and Rome.
	
	SELECT * 
	FROM   salesman 
	WHERE  city NOT LIKE 'Paris' 
	       AND city NOT LIKE 'Rome'; 
	       
--8. Write a SQL statement to find those salesmen with all information who gets the
--	commission within a range of 0.12 and 0.14
	
	SELECT * 
	FROM   salesman 
	WHERE  commission BETWEEN 0.12 AND 0.14; 
	
--9. Write a SQL statement to find those salesmen with all other information and 
--	name started with any latter within Aand 'K'.
	
	SELECT * FROM salesman WHERE name LIKE ‘[A-K]%’;
	DOESNT WORK
	
--10. Write a SQL statement to find those salesmen with all other information and name
--	started with other than any latter within A and 'L
	
	SELECT * FROM salesman WHERE name NOT LIKE ‘[A-L]%’;
	NOT WORKING
	
--11.  Write a SQL statement to find those salesmen with all information whose name
--	containing the 1st character is 'N' and the 4th character island rests may be any
--	character
	
	SELECT * FROM salesman WHERE name LIKE ‘N__L%’;
	
--12. Write a SQL statement to display the commission with the percent sign (%) with
--	salesman ID, name and city columns for all the salesmen.
	
	SELECT Concat(commission, ‘%’) AS commission, 
	       salesman_id, 
	       NAME, 
	       city 
	FROM   salesman; 

--Exercise 2

--1. Write a query to display the columns in a specific order like order date,
--	salesman id, order number and purchase amount from for all the orders
	
	SELECT ord_date, 
	       salesman_id, 
	       ord_no, 
	       purch_amt 
	FROM   orders;
	
--2.	Write a query which will retrieve the value of salesman id of all salesmen, getting
--	orders from the customers in orders table without any repeats
	
	SELECT DISTINCT salesman_id, 
	                ord_no 
	FROM            orders;
	NOT working 
	
--3. Write a SQL query to display the order number followed by order date and the
--	purchase amount for each order which will be delivered by the salesman who is
--	holding the ID 5001
	
	SELECT ord_no, 
	       ord_date, 
	       purch_amt 
	FROM   orders 
	WHERE  salesman_id = 5001;

--4. Write a SQL statement to display either those orders which are not issued on date
--	2012-09-10 and issued by the salesman whose ID is 505 and below or those orders
--	which purchase amount is 1000.00 and below.
	
	SELECT * 
	FROM   orders 
	WHERE  ( ord_date != '2012-09-10' 
	         AND salesman_id < 5005 ) 
	        OR purch_amt < 1000; 

--5. Write a SQL query to display all orders where purchase amount less than a specified
--	amount or order date and customer_id must not be greater than a specified data
--	and less than a specified ID respectively
	
	SELECT * FROM clt6.orders WHERE purch_amt < 1000
	SELECT * FROM clt6.orders WHERE ord_date < '2012-10-01';
	SELECT * FROM clt6.orders WHERE customer_id BETWEEN 3003 AND 3007;

--6. Display all in reverse, where order dates equal to a specified date or customer id
--	greater than a specified number and purchase amount less than a specified amount.	
	
	SELECT * 
	FROM   orders 
	WHERE  ord_date = '2012-10-05' 
	        OR customer_id > 3005 
	           AND purch_amt < 1000 
	ORDER  BY ord_no DESC; 
	
--7. Write a SQL query to display order number, purchase amount, archived, the
--	unachieved percentage for those order which exceeds the 50% of the target value of 6000
--	??
--	??

--8. Write a query to filter all those orders with all information which purchase amount
--	value is within the range 500 and 4000 except those orders of purchase amount
--	value 948.50 and 1983.43
	
	SELECT * 
	FROM   orders 
	WHERE  purch_amt BETWEEN 500 AND 4000 
	       AND purch_amt NOT IN ( 948.5, 1983.43 ); 

--9. Write a SQL statement to find the total purchase amount of all orders

	SELECT Sum(purch_amt) 
	FROM   clt6.orders;

--10. Write a SQL statement to find the average purchase amount of all orders

	SELECT Avg(purch_amt) 
	FROM   clt6.orders;

--11. Write a SQL statement to find the number of salesmen currently listing for all of their
--	customers.
	
	SELECT Count(salesman_id) 
	FROM   clt6.orders;
	
--12. Write SQL statement to get the maximum purchase amount of all the orders

	SELECT Max(purch_amt) 
	FROM   clt6.orders;

--13. Write a SOL statement to get the minimum purchase amount of all the orders

	SELECT Min(purch_amt) 
	FROM   clt6.orders;

--14. Write a SQL statement to find the highest purchase amount ordered by the each
--	customer with their ID and highest purchase amount
	
	SELECT customer_id, 
      	   Max(purch_amt) 
	FROM   clt6.orders 
	GROUP  BY customer_id; 

--15. Write a SQL statement to find the highest purchase amount ordered by the each
--	customer on a particular date with their id, order date and highest purchase
--	amount 
	
	SELECT customer_id, 
	       ord_date, 
	       purch_amt 
	FROM   clt6.orders 
	WHERE  ord_date = '2012-09-10' 
	ORDER  BY purch_amt DESC; 

--16. Write a SQL statement to find the highest purchase amount on date "2012-08-17 for 
--	each salesman with their ID.
	
	SELECT Max(purch_amt), 
	       salesman_id 
	FROM   clt6.orders 
	WHERE  ord_date = '2012-08-17'; 
	
--17. Write a SQL statement to find the highest purchase amount with the
--	date, for only those customers who have highest purchase amount in a day is more
--	than 2000
	
	SELECT customer_id, 
	       Max(purch_amt), 
	       ord_date 
	FROM   clt6.orders 
	WHERE  purch_amt > 2000 
	GROUP  BY customer_id; 

--18. Write a SQL statement to find the highest purchase amount with their ID and order
--	date, for those customers who have a higher purchase amount in a day is within the
--	range 2000 and 6000
	
	SELECT customer_id, 
	       Max(purch_amt), 
	       ord_date 
	FROM   clt6.orders 
	WHERE  purch_amt BETWEEN 2000 AND 6000 
	GROUP  BY customer_id 
	LIMIT  0, 1000; 

--19. Write a SQL statement to find the highest purchase amount with their ID and order
--	date, for only those customers who have a higher purchase amount in a day is within
--	the list 2000, 3000, 5760 and 6000
	
	SELECT customer_id, 
	       Max(purch_amt), 
	       ord_date 
	FROM   clt6.orders 
	WHERE  ( purch_amt BETWEEN 2000 AND 3000 ) 
	        OR ( purch_amt BETWEEN 5760 AND 6000 ) 
	GROUP  BY customer_id;
	 
--20. Write a SQL statement to find the highest purchase amount with their ID, for only
--	those customers whose ID is within the range 3002 and 3007
	
	SELECT customer_id, 
	       Max(purch_amt) 
	FROM   clt6.orders 
	WHERE  customer_id BETWEEN 3002 AND 3007 
	GROUP  BY customer_id; 	

--21. Write a SQL statement to display customer details (ID and purchase amount) whose
--	IDs are within the range 3002 and 3007 and highest purchase amount is more than
--	1000
	
	SELECT customer_id, 
	       purch_amt 
	FROM   clt6.orders 
	WHERE  customer_id BETWEEN 3002 AND 3007 
	       AND purch_amt > 1000 
	GROUP  BY customer_id; 

--22. Write a SQL statement to find the highest purchase amount with their ID for only
--	those salesmen whose ID is within the range 5003 and 5008	
	
	SELECT salesman_id, 
	       Max(purch_amt) 
	FROM   clt6.orders 
	WHERE  salesman_id BETWEEN 5003 AND 5008 
	GROUP  BY purch_amt; 
	
--23. Write a SQL statement that counts all orders for a date August 17th, 2012

	SELECT Count(ord_date) 
	FROM   clt6.orders 
	WHERE  ord_date = '2012-08-17';

--24. Write a SQL statement that counts the number of different non NULL city values for
--	salesmen.
	
	SELECT Count(salesman_id) 
	FROM   clt6.orders 
	WHERE  salesman_id IS NOT NULL;Paper said TO count city? 

--25. Write a query that counts the number of salesmen with their order date and ID
--	registering orders for each day
	
	SELECT   ord_date, 
	         Count(salesman_id) 
	FROM     clt6.orders 
	GROUP BY ord_date;

--26. Write a SQL statement to find out the number of orders booked for each day and
--	display it in such a format like "For 2001-10-10 there are 15 orders"
	
	SELECT Concat('For ', order_date, ' there were ', order_count, ' orders') AS 
	       'Order Count' 
	FROM   (SELECT ord_date      AS order_date, 
	               Count(ord_no) AS order_count 
	        FROM   clt6.orders 
	        GROUP  BY ord_date) AS SUBQUERY 

--27. Write a query to display the orders according to the order number arranged by
--	ascending order
	
	SELECT   * 
	FROM     clt6.orders 
	ORDER BY ord_no;

--28. Write a SQL statement to arrange the orders according to the order date in such a
--	manner that the latest date will come first then previous dates
	
	SELECT   * 
	FROM     clt6.orders 
	ORDER BY ord_date DESC;
	
--29. Write a SQL statement to display the orders with all information in such a manner
--	that, the older order date will come first and the highest purchase amount of same
--	day will come first
	
	SELECT   * 
	FROM     clt6.orders 
	ORDER BY ord_date, 
	         purch_amt DESC;
	         
--30. Write a SQL statement to make a report with salesman ID, order date and hughes
--	purchase amount in such an arrangement that, the smallest salesman ID will come
--	first along with their smallest order date
	
	SELECT   salesman_id    AS 'Salesman ID', 
	         ord_date       AS 'Order Date', 
	         Max(purch_amt) AS 'Max Purchase Amount' 
	FROM     clt6.orders 
	GROUP BY ord_date 
	ORDER BY salesman_id, 
	         ord_date;
	         
--31. Write a SQL statement to make a report with customer ID in such a manner the
--	largest number of orders booked by the customer will come first along with th
--	highest purchase amount
	
	SELECT   customer_id        AS 'Customer ID', 
	         Count(customer_id) AS 'Number of Orders', 
	         Max(purch_amt)     AS 'Biggest Purchase' 
	FROM     clt6.orders 
	GROUP BY customer_id;
 


--Exercise - Customer table

--1. Write a SQL statement to display all the information for those customers with a
--	grade of 200
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  grade = 200;

--2. Write a query to display all customers with a grade above 100.

	SELECT * 
	FROM   clt6.customer 
	WHERE  grade > 100;
	
--3. Write a query statement to display all customers New York who have a grade
--	value above 100
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  city = 'New York' 
	AND    grade > 100;
	
--4. Write a SQL statement to display all customers, who are either belongs to the city
--	New York or had a grade above 100
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  city = 'New York' 
	OR     grade > 100;
	
--5. Write a SQL statement to display all the customers, who are either belongs to the
--	city New York or not had a grade above 100
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  city = 'New York' 
	OR     NOT grade > 100;
	
--6. Write a SQL query to display those customers who are neither belongs to the city
--	New York nor grade value is more than 100
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  NOT ( 
	              city = 'New York' 
	       OR     grade > 100);

--7. Write a query to sort out those customers with all information whose ID value is
--	within any of 3007, 3008 and 3009.
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  customer_id IN (3007, 
	                       3008, 
	                       3009);
	                       
--8. Write a SQL statement to find that customer with all information who does not get
	any grade except NULL
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  grade IS NULL;
	
--9. Write a SQL statement to find that customer with all information who gets a grade
	except NULL value
	
	SELECT * 
	FROM   clt6.customer 
	WHERE  grade IS NOT NULL;
	
--10. Write a SQL statement know how many customer have listed their names.

	SELECT Count(cust_name) 
	FROM   clt6.customer;
 
--11. Write a SQL statement find the number of customers who gets at least a gradation
--	for his/her performance.
	
--	Not sure what grade to look for
	SELECT Count(cust_name) 
	FROM   clt6.customer 
	WHERE  grade >= 200;12SELECT   city       AS 'City', 
	         Max(grade) AS 'Highest Grade' 
	FROM     clt6.customer 
	GROUP BY city;

--12. Write a SQL statement which selects the highest grade for each of the cities of the
--	customers.
	
	SELECT 
	    city, MAX(grade)
	FROM
	    clt6.customer
	GROUP BY city;
 
--13. Write a SQL statement to display the customer name, city, and grade, etc. and the
--	display will be arranged according to the smallest customer ID.
	
	SELECT 
	    customer_id, cust_name, city, grade
	FROM
	    clt6.customer
	ORDER BY customer_id;
 

--SQL – Join Exercises

--1. Write a SQL statement to prepare a list with salesman name, customer name and
--	their cities for the salesmen and customer who belongs to the same city. [refer
--	Salesman and customer]
	
	SELECT salesman.city AS 'city',salesman.NAME AS 'Salesman', 
	       customer.cust_name AS 'Customer' 
	FROM   clt6.salesman 
	       INNER JOIN clt6.customer using (city); 
 
--2.  Write a SQL statement to make a list with order no, purchase amount, customer
--	name and their cities for those orders which order amount between 500 and 2000
--	[refer Salesman and customer]
	
	SELECT orders.ord_no,orders.purch_amt,customer.cust_name,customer.city 
	FROM   clt6.orders,clt6.customer 
	WHERE  clt6.orders.customer_id = clt6.customer.customer_id 
	       AND purch_amt BETWEEN 500 AND 2000; 

 
--3. Write a SQL statement to know which salesman are working for which customer
--	[refer customer and salesman]
	
	SELECT customer.cust_name,salesman.NAME 
	FROM   clt6.customer 
	       LEFT OUTER JOIN clt6.salesman using (salesman_id); 
 
--4. Write a SQL statement to find the list of customers who appointed a salesman for
--	their jobs who gets a commission from the company is more than 12%, [refer
--	customer and Salesman]
	
	SELECT customer.cust_name 
	FROM   clt6.customer,clt6.salesman 
	WHERE  salesman.salesman_id = customer.salesman_id 
	       AND customer.salesman_id IS NOT NULL 
	       AND salesman.commission > 0.12; 
 
--5. Write a SQL statement to find the list of customers who appointed a salesman for
--	their jobs who does not live in the same city where their customer lives, and gets a
--	commission is above 12% [refer customer and Salesman]
	
	SELECT customer.cust_name 
	FROM   clt6.customer,clt6.salesman 
	WHERE  salesman.salesman_id = customer.salesman_id 
	       AND customer.salesman_id IS NOT NULL 
	       AND customer.city != salesman.city 
	       AND salesman.commission > 0.12; 

--6. Write a SQL statement to find the details of a order Le. order number, order date,
--	amount of order, which customer gives the order and which salesman works for that
--	customer and how much commission he gets for an order [ refer order, customer
--	and salesman]
	
	SELECT orders.ord_no,orders.ord_date,orders.purch_amt,customer.cust_name, 
	       salesman.NAME AS 'Salesman Name',salesman.commission 
	FROM   clt6.orders,clt6.customer,clt6.salesman 
	WHERE  orders.customer_id = customer.customer_id 
	       AND orders.salesman_id = salesman.salesman_id 
 
--7. Write a SQL statement to make a join on the tables salesman, customer and orders
--	in such a form that the same column of each table will appear once and only the
--	relational rows will come. [refer order, customer and salesman]
	
	SELECT customer.customer_id,salesman.city,orders.salesman_id 
	FROM   clt6.orders,clt6.customer,clt6.salesman 
	WHERE  customer.customer_id = orders.customer_id 
	       AND salesman.city = customer.city 
	       AND ( orders.salesman_id = customer.salesman_id 
	             AND customer.salesman_id = salesman.salesman_id ) 
 
--8. Write a SQL statement to make a list in ascending order for the customer who works
--	either through a salesman or by own [refer Salesman and customer]
	
	SELECT customer.customer_id,customer.cust_name AS 'Customer Name', 
	       salesman.NAME AS 'Salesman Name' 
	FROM   clt6.customer 
	       LEFT OUTER JOIN clt6.salesman 
	                    ON customer.salesman_id = salesman.salesman_id 
	ORDER  BY customer.customer_id 
 
--9. Write a SQL statement to make a list in ascending order for the customer who holds
--	a grade less than 300 and works either through a salesman or by own. [refer
--	Salesman and customer]
	
	SELECT customer.customer_id,customer.cust_name AS 'Customer Name', 
	       salesman.NAME AS 'Salesman Name',customer.grade 
	FROM   clt6.customer,clt6.salesman 
	WHERE  customer.salesman_id = salesman.salesman_id 
	       AND grade < 300 
	ORDER  BY customer.customer_id 
 
--10. Write a SQL statement to make a report with customer name, city, order number,
--	order date, order amount salesman name and commission to find that either any of
--	the existing customers have placed no order or placed one or more orders by their
--	salesman or by own [ refer order, customer and salesman]
	
	SELECT customer.cust_name,customer.city,orders.ord_no,orders.ord_date, 
	       orders.purch_amt, 
	       salesman.NAME AS 'Salesman Name',salesman.commission 
	FROM   clt6.customer,clt6.salesman,clt6.orders 
	WHERE  orders.customer_id = customer.customer_id 
	       AND orders.salesman_id = salesman.salesman_id 
 
--11. Write a SQL statement to make a list for the salesmen who works either for one or
--	more customer or not yet join under any of the customers who placed either one or
--	more orders or no order to their supplier. [refer order, customer and
--	salesman]
	
--12. Write a SQL statement to make a list for the salesmen who either work for one or
--	more customers or yet to join any of the customer The customer may have placed
--	either one or more orders on or above order amount 2000 and must have grade
--	not have placed any order to the associated supplier(refer salesman
--	customer and order)

--13. Write SQL statement that produces all orders with the order number, customer
--	name, commission rate and earned commission amount for those customers who
--	carry their grade more than 200 and served by an existing salesman, [ refer
--	salesman, customer and order ]
	
	SELECT orders.ord_no,customer.cust_name,salesman.commission 
	FROM   clt6.customer,clt6.salesman,clt6.orders 
	WHERE  customer.customer_id = orders.customer_id 
	       AND salesman.salesman_id = orders.salesman_id 
	       AND customer.grade > 200 
 

--SQL Union Exercises

--1. Write a query to display all salesmen and customer located in London. [refer
--	customer and salesman]
	
	SELECT customer.cust_name,customer.city 
	FROM   clt6.customer 
	WHERE  city = 'London' 
	UNION 
	SELECT salesman.NAME,salesman.city 
	FROM   clt6.salesman 
	WHERE  city = 'London' 
 
--2.  Write a query to display distinct salesman and their cities. [ refer customer and
--	salesman ]
	
	SELECT DISTINCT salesman.name, salesman.city FROM clt6.salesman
 
--3. Write a query to display all the salesmen and customer involved in this inventory
--	management system. [ refer order and customer ]
	
	SELECT salesman.NAME 
	FROM   clt6.salesman 
	UNION 
	SELECT customer.cust_name 
	FROM   clt6.customer 
 
--4. Write a query to make a report of which salesman produce the largest and smallest
--	orders on each date. (refer order, customer and salesman)
	
	SELECT salesman.salesman_id,salesman.NAME,orders.ord_date, 
	       Max(orders.purch_amt) AS 'MAX, MIN' 
	FROM   clt6.salesman,clt6.orders 
	WHERE  orders.salesman_id = salesman.salesman_id 
	GROUP  BY orders.ord_date 
	UNION 
	SELECT salesman.salesman_id,salesman.NAME,orders.ord_date,Min(orders.purch_amt) 
	FROM   clt6.salesman,clt6.orders 
	WHERE  orders.salesman_id = salesman.salesman_id 
	GROUP  BY orders.ord_date 
	ORDER  BY ord_date 
 
--5. Write a query to make a report of which salesman produce the largest and smallest
--	orders on each date and arranged the orders number in smallest to the largest
--	number [ refer customer and salesman ]
	
	SELECT salesman.salesman_id,salesman.NAME,orders.ord_date,orders.ord_no, 
	       Max(orders.purch_amt) AS 'MAX, MIN' 
	FROM   clt6.salesman,clt6.orders 
	WHERE  orders.salesman_id = salesman.salesman_id 
	GROUP  BY orders.ord_date 
	UNION 
	SELECT salesman.salesman_id,salesman.NAME,orders.ord_date,orders.ord_no, 
	       Min(orders.purch_amt) 
	FROM   clt6.salesman,clt6.orders 
	WHERE  orders.salesman_id = salesman.salesman_id 
	GROUP  BY orders.ord_date 
	ORDER  BY ord_no 
 
--6. Write a query to list all the salesmen, and indicate those who do not have customers
--	in their cities, as well as whose who do. [ refer salesman and customer ]
	
	SELECT salesman.salesman_id,salesman.NAME 
	FROM   clt6.salesman,clt6.customer 
	WHERE  customer.salesman_id = salesman.salesman_id 
	       AND salesman.city != customer.city 
	UNION 
	SELECT salesman.salesman_id,salesman.NAME 
	FROM   clt6.salesman,clt6.customer 
	WHERE  customer.salesman_id = salesman.salesman_id 
	       AND salesman.city = customer.city 
 
