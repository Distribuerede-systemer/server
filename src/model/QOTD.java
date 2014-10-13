package model;


//	Implementeres i server
//	int quotenumber = 0;
//	if  (quotenumber = QuoteOfTheDay.getLength())
//			quotenumber = 0;
//	String quote = QOTD.getQuote(quotenumber);
//	quotenumber++;
public class QOTD {
	
	
	String quotes[] = new String[366];
//QuoteOfTheDay kræver en int værdi der represænterer den forrige quote
//Der må gæmmes en værdi i serveren der lægges til hver gang et nyt quote hentes
	
	public String getQuote (int lastQuote){

			
			
			quotes[0] = "Everything has beauty, but not everyone can see. –Confucius";
			quotes[1] = "Life isn’t about getting and having, it’s about giving and being. –Kevin Kruse";
			quotes[2] = "Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill";
			quotes[3] = "Strive not to be a success, but rather to be of value. –Albert Einstein";
			quotes[4] = "Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.  –Robert Frost";
			quotes[5] = "I attribute my success to this: I never gave or took any excuse. –Florence Nightingale";
			quotes[6] = "You miss 100% of the shots you don’t take. –Wayne Gretzky";
			quotes[7] = "I’ve missed more than 9000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life. And that is why I succeed. –Michael Jordan";
			quotes[8] = "The most difficult thing is the decision to act, the rest is merely tenacity. –Amelia Earhart";
			quotes[9] = "Every strike brings me closer to the next home run. –Babe Ruth";
			quotes[10] = "Definiteness of purpose is the starting point of all achievement. –W. Clement Stone";
			quotes[11] = "We must balance conspicuous consumption with conscious capitalism. –Kevin Kruse";
			quotes[12] = "Life is what happens to you while you’re busy making other plans. –John Lennon";
			quotes[13] = "We become what we think about. –Earl Nightingale";
			quotes[14] = "Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do, so throw off the bowlines, sail away from safe harbor, catch the trade winds in your sails.  Explore, Dream, Discover. –Mark Twain";
			quotes[15] = "Life is 10% what happens to me and 90% of how I react to it. –Charles Swindoll";
			quotes[16] = "The most common way people give up their power is by thinking they don’t have any. –Alice Walker";
			quotes[17] = "The mind is everything. What you think you become.  –Buddha";
			quotes[18] = "The best time to plant a tree was 20 years ago. The second best time is now. –Chinese Proverb";
			quotes[19] = "An unexamined life is not worth living. –Socrates";
			quotes[20] = "Eighty percent of success is showing up. –Woody Allen";
			quotes[21] = "Your time is limited, so don’t waste it living someone else’s life. –Steve Jobs";
			quotes[22] = "Winning isn’t everything, but wanting to win is. –Vince Lombardi";
			quotes[23] = "I am not a product of my circumstances. I am a product of my decisions. –Stephen Covey";
			quotes[24] = "Every child is an artist.  The problem is how to remain an artist once he grows up. –Pablo Picasso";
			quotes[25] = "You can never cross the ocean until you have the courage to lose sight of the shore. –Christopher Columbus";
			quotes[26] = "I’ve learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. –Maya Angelou";
			quotes[27] = "Either you run the day, or the day runs you. –Jim Rohn";
			quotes[28] = "Whether you think you can or you think you can’t, you’re right. –Henry Ford";
			quotes[29] = "The two most important days in your life are the day you are born and the day you find out why. –Mark Twain";
			quotes[30] = "Whatever you can do, or dream you can, begin it.  Boldness has genius, power and magic in it. –Johann Wolfgang von Goethe";
			quotes[31] = "The best revenge is massive success. –Frank Sinatra";
			quotes[32] = "People often say that motivation doesn’t last. Well, neither does bathing.  That’s why we recommend it daily. –Zig Ziglar";
			quotes[33] = "Life shrinks or expands in proportion to one’s courage. –Anais Nin";
			quotes[34] = "If you hear a voice within you say you cannot paint, then by all means paint and that voice will be silenced. –Vincent Van Gogh";
			quotes[35] = "There is only one way to avoid criticism: do nothing, say nothing, and be nothing. –Aristotle";
			quotes[36] = "Ask and it will be given to you; search, and you will find; knock and the door will be opened for you. –Jesus";
			quotes[37] = "The only person you are destined to become is the person you decide to be. –Ralph Waldo Emerson";
			quotes[38] = "Go confidently in the direction of your dreams.  Live the life you have imagined. –Henry David Thoreau";
			quotes[39] = "When I stand before God at the end of my life, I would hope that I would not have a single bit of talent left and could say, I used everything you gave me. –Erma Bombeck";
			quotes[40] = "Few things can help an individual more than to place responsibility on him, and to let him know that you trust him.  –Booker T. Washington";
			quotes[41] = "Certain things catch your eye, but pursue only those that capture the heart. – Ancient Indian Proverb";
			quotes[42] = "Believe you can and you’re halfway there. –Theodore Roosevelt";
			quotes[43] = "Everything you’ve ever wanted is on the other side of fear. –George Addair";
			quotes[44] = "We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light. –Plato";
			quotes[45] = "Teach thy tongue to say, I do not know, and thous shalt progress. –Maimonides";
			quotes[46] = "Start where you are. Use what you have.  Do what you can. –Arthur Ashe";
			quotes[47] = "When I was 5 years old, my mother always told me that happiness was the key to life.  When I went to school, they asked me what I wanted to be when I grew up.  I wrote down ‘happy’.  They told me I didn’t understand the assignment, and I told them they didn’t understand life. –John Lennon";
			quotes[48] = "Fall seven times and stand up eight. –Japanese Proverb";
			quotes[49] = "When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us. –Helen Keller";
			quotes[50] = "How wonderful it is that nobody need wait a single moment before starting to improve the world. –Anne Frank";
			quotes[51] = "When I let go of what I am, I become what I might be. –Lao Tzu";
			quotes[52] = "Life is not measured by the number of breaths we take, but by the moments that take our breath away. –Maya Angelou";
			quotes[53] = "Happiness is not something readymade. It comes from your own actions. –Dalai Lama";
			quotes[54] = "If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on. –Sheryl Sandberg";
			quotes[55] = "First, have a definite, clear practical ideal; a goal, an objective. Second, have the necessary means to achieve your ends; wisdom, money, materials, and methods. Third, adjust all your means to that end. –Aristotle";
			quotes[56] = "If the wind will not serve, take to the oars. –Latin Proverb";
			quotes[57] = "You can’t fall if you don’t climb. But there’s no joy in living your whole life on the ground. –Unknown";
			quotes[58] = "We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained. –Marie Curie";
			quotes[59] = "Too many of us are not living our dreams because we are living our fears. –Les Brown";
			quotes[60] = "Challenges are what make life interesting and overcoming them is what makes life meaningful. –Joshua J. Marine";
			quotes[61] = "If you want to lift yourself up, lift up someone else. –Booker T. Washington";
			quotes[62] = "I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do. –Leonardo da Vinci";
			quotes[63] = "Limitations live only in our minds. But if we use our imaginations, our possibilities become limitless. –Jamie Paolinetti";
			quotes[64] = "You take your life in your own hands, and what happens? A terrible thing, no one to blame. –Erica Jong";
			quotes[65] = "What’s money? A man is a success if he gets up in the morning and goes to bed at night and in between does what he wants to do. –Bob Dylan";
			quotes[66] = "I didn’t fail the test. I just found 100 ways to do it wrong. –Benjamin Franklin";
			quotes[67] = "In order to succeed, your desire for success should be greater than your fear of failure. –Bill Cosby";
			quotes[68] = "A person who never made a mistake never tried anything new. – Albert Einstein";
			quotes[69] = "The person who says it cannot be done should not interrupt the person who is doing it. –Chinese Proverb";
			quotes[70] = "There are no traffic jams along the extra mile. –Roger Staubach";
			quotes[71] = "It is never too late to be what you might have been. –George Eliot";
			quotes[72] = "You become what you believe. –Oprah Winfrey";
			quotes[73] = "I would rather die of passion than of boredom. –Vincent van Gogh";
			quotes[74] = "A truly rich man is one whose children run into his arms when his hands are empty. –Unknown";
			quotes[75] = "It is not what you do for your children, but what you have taught them to do for themselves, that will make them successful human beings. –Ann Landers";
			quotes[76] = "If you want your children to turn out well, spend twice as much time with them, and half as much money. –Abigail Van Buren";
			quotes[77] = "Build your own dreams, or someone else will hire you to build theirs. –Farrah Gray";
			quotes[78] = "The battles that count aren’t the ones for gold medals. The struggles within yourself–the invisible battles inside all of us–that’s where it’s at. –Jesse Owens";
			quotes[79] = "Education costs money. But then so does ignorance. –Sir Claus Moser";
			quotes[80] = "I have learned over the years that when one’s mind is made up, this diminishes fear. –Rosa Parks";
			quotes[81] = "It does not matter how slowly you go as long as you do not stop. –Confucius";
			quotes[82] = "If you look at what you have in life, you’ll always have more. If you look at what you don’t have in life, you’ll never have enough. –Oprah Winfrey";
			quotes[83] = "Remember that not getting what you want is sometimes a wonderful stroke of luck. –Dalai Lama";
			quotes[84] = "You can’t use up creativity. The more you use, the more you have. –Maya Angelou";
			quotes[85] = "Dream big and dare to fail. –Norman Vaughan";
			quotes[86] = "Our lives begin to end the day we become silent about things that matter. –Martin Luther King Jr.";
			quotes[87] = "Do what you can, where you are, with what you have. –Teddy Roosevelt";
			quotes[88] = "If you do what you’ve always done, you’ll get what you’ve always gotten. –Tony Robbins";
			quotes[89] = "Dreaming, after all, is a form of planning. –Gloria Steinem";
			quotes[90] = "It’s your place in the world; it’s your life. Go on and do all you can with it, and make it the life you want to live. –Mae Jemison";
			quotes[91] = "You may be disappointed if you fail, but you are doomed if you don’t try. –Beverly Sills";
			quotes[92] = "Remember no one can make you feel inferior without your consent. –Eleanor Roosevelt";
			quotes[93] = "Life is what we make it, always has been, always will be. –Grandma Moses";
			quotes[94] = "The question isn’t who is going to let me; it’s who is going to stop me. –Ayn Rand";
			quotes[95] = "When everything seems to be going against you, remember that the airplane takes off against the wind, not with it. –Henry Ford";
			quotes[96] = "It’s not the years in your life that count. It’s the life in your years. –Abraham Lincoln";
			quotes[97] = "Change your thoughts and you change your world. –Norman Vincent Peale";
			quotes[98] = "Either write something worth reading or do something worth writing. –Benjamin Franklin";
			quotes[99] = "Nothing is impossible, the word itself says, I’m possible! –Audrey Hepburn";
			quotes[100] = "The only way to do great work is to love what you do. –Steve Jobs";
			quotes[101] = "If you can dream it, you can achieve it. –Zig Ziglar";
			
//			Random randomNumber = new Random();
//          int selector = randomNumber.nextInt(quotes.length);
			int selector = lastQuote++;
			String todaysQuote = quotes[selector];
			
			


			
			
			System.out.println(todaysQuote);
			return todaysQuote;
			
		}
	public int getLength(){
		return quotes.length;
	}
	}

