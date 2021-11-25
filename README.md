

In this project we tried our best to make a prototype of canteen. The canteen of future where
waiter will be robots who will do all the work starting from meeting the customers and ending
with cleaning process of canteen. People only come here to eat and pay, the rest is covered by
robots.

Our project covers all the patterns we passed during the Software Design Patterns course. For
example:

* Service.java - is using Observer pattern to implement the work of Clients and our canteen service 
all together. Canteen will notify our clients once they get into the canteen & send robot waiters
to show clients their spots in the canteen.

* Time.java uses State pattern to switch menu items for each of the following times: Breakfast,
Lunch, Supper, i.e for breakfast only particular foods are shown. The same concept is applied
to Lunch and Supper. Once people had their breakfast Time will change its state to Lunch, subsequently
will change to Supper.

* Waiter.java uses Strategy pattern so that an object could have different responsibilities as it
was mentioned above: Meeting clients, Cleaning, Getting orders and providing the cheque.

* MenuTemplate uses Template pattern since all 3 menus(Breakfast, Lunch, Supper) have almost the same
design. Only the menu items part is different.

* Payment.java uses Adapter pattern to make different payment methods (QR, cash) execute using only 
method - Pay(). Clients can choose their prefered way of paying but the robot will receive the payment
without caring about if the client made a payment using QR or cash. Both are the same for the robot.

* Finally, The chef class uses Decorator pattern to decorate the iteration process of meal.
First, meal ingredients are prepared and sent to the Middle Chef from Junior one. Afterwards, it is 
sent to Senior Chef to test and make an evaluation.

To sum up, the example we provided is although on the abstract level but very original. 
It would be cool to see such thing in the near future. We hope our prototype can reach
necessary people who can make this idea come true.

Thank you!
