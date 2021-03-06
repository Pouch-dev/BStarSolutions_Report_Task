USE [RESTful_API_version001]
GO
/****** Object:  Table [dbo].[category]    Script Date: 9/13/2021 6:20:29 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[category](
	[idc] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[idc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[customer]    Script Date: 9/13/2021 6:20:29 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[customer](
	[idu] [int] IDENTITY(1,1) NOT NULL,
	[password] [varchar](255) NULL,
	[role] [varchar](255) NULL,
	[username] [varchar](255) NULL,
	[text] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[idu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 9/13/2021 6:20:29 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](255) NULL,
	[price] [int] NOT NULL,
	[cateid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[category] ON 

INSERT [dbo].[category] ([idc], [name]) VALUES (1, N'Phone')
INSERT [dbo].[category] ([idc], [name]) VALUES (2, N'Laptop')
SET IDENTITY_INSERT [dbo].[category] OFF
GO
SET IDENTITY_INSERT [dbo].[customer] ON 

INSERT [dbo].[customer] ([idu], [password], [role], [username], [text]) VALUES (1, N'123', N'1', N'123', NULL)
SET IDENTITY_INSERT [dbo].[customer] OFF
GO
SET IDENTITY_INSERT [dbo].[product] ON 

INSERT [dbo].[product] ([id], [name], [price], [cateid]) VALUES (1, N'iPhone11', 15000000, 1)
INSERT [dbo].[product] ([id], [name], [price], [cateid]) VALUES (4, N'iPhone12', 18000000, 1)
INSERT [dbo].[product] ([id], [name], [price], [cateid]) VALUES (5, N'HP', 19000000, 2)
INSERT [dbo].[product] ([id], [name], [price], [cateid]) VALUES (6, N'Aser', 20000000, 2)
SET IDENTITY_INSERT [dbo].[product] OFF
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FKt3b224xjwuefm2m3hhfxwp067] FOREIGN KEY([cateid])
REFERENCES [dbo].[category] ([idc])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FKt3b224xjwuefm2m3hhfxwp067]
GO
