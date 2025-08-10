
#1)
# User = frappe.qb.DocType("User")
# frappe.qb.from_(User).select("*").run(as_dict=True)


# 2
# query = frappe.qb.from_(User).select('name').where(User.enabled == 1)

#3
# frappe.qb.from_(User).select(User.name,User.email).where(User.first_name == "Ahmed").run(as_dict=True)


# 4
# Item = frappe.qb.DocType("Item")
# frappe.qb.from_(Item).select(Item.name).where(Item.item_group == "Services").run(as_dict=True)

#5
# Customer = frappe.qb.DocType("Customer")

# frappe.qb.from_(Customer).select("*").orderby(Customer.creation,order=frappe.qb.desc).limit(5).run(as_dict=True)


# ---------------------------------------------------------------

# 1)
# SalesInvoice = frappe.qb.DocType("Sales Invoice")
# frappe.qb.from_(SalesInvoice).select('*').where(SalesInvoice.posting_date > '2024-01-01').run(as_dict=True)


# 2)

# PurchaseOrder = frappe.qb.DocType("Purchase Order")
# frappe.qb.from_(PurchaseOrder).select(PurchaseOrder.name).where(~PurchaseOrder.status.isin(["Closed"])).run(as_dict=True)


# 3)
# SalesInvoice = frappe.qb.DocType("Sales Invoice")
# frappe.qb.from_(SalesInvoice).select(SalesInvoice.name,SalesInvoice.total).where(SalesInvoice.grand_total > 10000).run(as_dict=True)


#
#4)
# from frappe.query_builder.functions import Count
# User = frappe.qb.DocType("User")

# frappe.qb.from_(User).select(Count(User.name).as_("Users Count")).where(User.enabled == 1).run(as_dict=True)


# 5)

# Item = frappe.qb.DocType("Item")
# frappe.qb.from_(Item).select(Item.item_group).distinct()



# ----------------------------------------------------------------------------------

# 1)

# SalesInvoice = frappe.qb.DocType("Sales Invoice")
# frappe.qb.from_(SalesInvoice).select(SalesInvoice.customer,Count(SalesInvoice.name)).groupby(SalesInvoice.customer).orderby(Count(SalesInvoice.customer),order=frappe.qb.desc).limit(3).run()

# 2)
# frappe.qb.DocType("Sales Invoice")
# frappe.qb.DocType("Sales Invoice Item")
# frappe.qb.from_(SalesInvoice).inner_join(SalesInvoiceItem).on(SalesInvoice.name == SalesInvoiceItem.parent).select(SalesInvoice.name.as_("Sales Invoice Name"),SalesInvoiceItem.item_code.as_("Item Code")).where(SalesInvoice.name == "ACC-SINV-2025-00001").run(as_dict=True)



# 3)
# frappe.qb.DocType("Sales Invoice")
# from frappe.query_builder import functions as fn
# frappe.qb.from_(SalesInvoice).select(SalesInvoice.customer.as_("Customer Name"),fn.Sum(SalesInvoice.grand_total).as_("total")).groupby(SalesInvoice.customer).run(as_dict=True)


# 4)

# frappe.qb.from_(User).left_join(Employee).on(User.name == Employee.user_id).select(User.name.as_("User Name"),Employee.name.as_("Employee Name")).where(Employee.user_id.isnull()).run(as_dict=True)

# 5)
# frappe.qb.from_(Item).left_join(SalesInvoiceItem).on(Item.name == SalesInvoiceItem.item_code).select(Item.name).where(SalesInvoiceItem.item_code.isnull()).run(as_dict=True)
