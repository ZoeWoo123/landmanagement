<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8"/>
		<title></title>
		<style>
			*{
				margin: 0;
				padding: 0;
				box-sizing: border-box;
			}
			body{
				font-family: SimSun;
			}
			section{
				display:block;
				margin: 20px 10px;
			}
			.title{
				text-align: center;
			}
			.preface p{
				line-height: 30px;
			}
			.preface p.content{
				text-indent: 2em;
			}
			section > table{
				table-layout: fixed;
				width: 100%;
				margin: 20px 0px;
				text-align:center;
				word-wrap:break-word;
			}
			section table td{
				padding:5px 0px;
			}
		</style>
	</head>
	<body>
		<!-- Title start -->
		<section class="title">
			<h2>LISTING MANAGEMENT AGREEMENT</h2>
            <h3>Open Doors Management and Client</h3>
		</section>
		<!-- Title end -->
		
		<!-- Foreword start -->
		<section class="preface">
			<h4>${date}</h4>
            <br/>
            <h4>${oft.fullname} ${oft.streetaddress}</h4>
            <br/>
            <h4>Dear ${oft.salutation},</h4>
            <br/>
			<p>${contract.greeting}</p>
            <br/>
            <p>${contract.background}</p>
            <br/>
            <h4 style="text-decoration: underline;">Why Your Property?</h4>
            <p>${contract.whyyourproperty}</p>
            <h4 style="text-align:center;">${oft.parcelacreage}</h4>
            <h4 style="text-align:center;">${oft.citystatezip}</h4>
            <p>${contract.ouroffer}</p>
            <br/>
            <p>${contract.ourjob}</p>
            <br/>
            <h4 style="text-decoration: underline;">Why New Power Generation Like Solar and Wind?</h4>
            <p>New solar and wind coupled with energy storage is now much less expensive than new coal, gas or nuclear. Therefore, electricity companies and corporations are contracting for new power. The good news is that I want to get your property in the running. The bad news is that you may just toss this letter as another sales call. Please don’t! My team is completely committed to executing on a no-risk basis. We just need a signed, six-month listing agreement. That agreement is attached and there is no financial obligation on your part when you sign. We are aligned. When we obtain $1 for your land, you get $0.92 and Open Doors Management gets $0.08. We are working strictly on a success fee basis.</p>
            <br/>
            <p>Our firm works for you. We have experience. And, we have industry relationships with the biggest and most successful energy companies in the US including NextEra and 8minute Solar. LevelTen Energy is an international energy auctioneer and we use them as well to market land assets. </p>
            <br/>
            <h4 style="text-decoration: underline;">Demand for Electricity is on the Rise</h4>
            <p>The current Biden administration is full-steam ahead for clean energy and electrification of transportation. This is good news for you if you sign the listing agreement and Open Doors Management can represent your land.</p>
            <br/>
            <p>The attached agreement enables us to move forward as partners in securing a long term lease or sale of your property. Time is of the essence.</p>
            <br/>
            <h4 style="text-decoration: underline;">Regarding the Listing Agreement</h4>
            <p>${contract.regardingagreement}</p>
            <br/>
            <p>Sincerely,</p>
            <img src="signature.png" style="width: 50%;"/>
            <p>Lane W Sharman Jr</p>
            <p>President, Open Doors Management</p>
        </section>
		<!-- Foreword end -->
        <section class="title">
			<h2>LISTING MANAGEMENT AGREEMENT</h2>
            <h3>Open Doors Management and Client</h3>
        </section>
		<section class="preface">
            <h2 style="text-align:center;">Listing Agreement</h2>
            <p>The Owner (“Client”) is ${oft.fullname}</p>
            <p>and BWX Inc dba as Open Doors Management is the Manager (“Manager”). Both (the “Parties”) do hereby agree to work together according to these conditions:</p>
            <ol>
                <li>The term of the Agreement is six months and shall renew automatically for the same amount of time unless terminated in writing by either Client or Manager.</li>
                <br/>
                <li>The Manager shall work with all those in the renewable energy industry to secure an offer for the Client’s properties, either a lease or purchase, all of which is subject to cooperative planning and understandings between the Client and the Manager. The Manager shall prepare the terms and conditions of the transaction subject to the approval of both parties (“Term Sheet”). The Client shall cooperate in all respects including site inspections and the production of existing documents.</li>
                <br/>
                <li>The Client shall compensate the Manager in the amount of 8% of the gross option, purchase, lease or any other form of compensation paid to the Client in connection with a land transaction.</li>
                <br/>
                <li>Either party may terminate the Agreement with a 30 day notice. In the event of a termination, the requirement to compensate the Manager shall remain in force for 180 days following the termination. The Client shall not terminate the Agreement in order to circumvent the obligation to the Manager from a pending offer.</li>
                <br/>
                <li>In order to effect a lease or a purchase, a licensed attorney or realtor shall be hired jointly by the Client and the Manager to draft a sales agreement or a lease subject to the Term Sheet. The Owner shall pay the fee associated with this third party service.</li>
                <br/>
                <li>The Agreement is governed by the laws of Colorado. Any dispute arising from this Agreement shall be resolved in mediation and arbitration according to the rules of the American Arbitration Association.</li>
            </ol>
            <p>Agreed this date    ${date}        by the Client and the Manager:</p>        
            <br/>
            <br/>
            <p>CLIENT:</p>
            <p>BY:</p>
            <p>PRINT NAME:</p>
            <p>PRINT TITLE:</p>
            <br/>
            <br/>
            <p>Manager: </p>
            <h4>BWX INC dba Open Doors Management</h4>
            <p>BY:</p>
            <img src="signature.png" style="width: 50%;"/>
            <p>PRINT NAME: 	Lane Sharman</p>
            <p>PRINT TITLE:	President</p>
            
		</section>
        
	</body>
</html>
