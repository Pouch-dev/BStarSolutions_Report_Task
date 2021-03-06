USE [RESTful_API]
GO
/****** Object:  Table [dbo].[category]    Script Date: 9/6/2021 4:35:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[category](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
 CONSTRAINT [PK__category__3213E83F5A9DD460] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 9/6/2021 4:35:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[detail] [nvarchar](255) NULL,
	[image] [varchar](255) NULL,
	[name] [nvarchar](255) NULL,
	[price] [int] NOT NULL,
	[categoryid] [int] NULL,
 CONSTRAINT [PK__product__3213E83F89386A71] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[category] ON 

INSERT [dbo].[category] ([id], [name]) VALUES (1, N'Điện Thoại')
INSERT [dbo].[category] ([id], [name]) VALUES (2, N'Máy Tính')
INSERT [dbo].[category] ([id], [name]) VALUES (3, N'Linh Kiện')
SET IDENTITY_INSERT [dbo].[category] OFF
GO
SET IDENTITY_INSERT [dbo].[product] ON 

INSERT [dbo].[product] ([id], [detail], [image], [name], [price], [categoryid]) VALUES (1, N'điện thoại iPhone', NULL, N'iPhone X', 9000000, 1)
INSERT [dbo].[product] ([id], [detail], [image], [name], [price], [categoryid]) VALUES (2, N'điện thoại SamSung', NULL, N'SamSung Note 9', 11000000, 1)
INSERT [dbo].[product] ([id], [detail], [image], [name], [price], [categoryid]) VALUES (3, N'máy tính thương hiệu HP', NULL, N'Máy Tính HP', 18000000, 2)
INSERT [dbo].[product] ([id], [detail], [image], [name], [price], [categoryid]) VALUES (4, N'máy tính thương hiệu Acer', NULL, N'Máy Tính Acer', 20000000, 2)
INSERT [dbo].[product] ([id], [detail], [image], [name], [price], [categoryid]) VALUES (5, N'tai nghe thương hiệu Apple', NULL, N'Tai Nghe iPhone', 120000, 3)
INSERT [dbo].[product] ([id], [detail], [image], [name], [price], [categoryid]) VALUES (6, N'tai nghe thương hiệu SamSung', NULL, N'Tai Nghe SamSung', 110000, 3)
SET IDENTITY_INSERT [dbo].[product] OFF
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK4ort9abhumpx4t2mlngljr1vi] FOREIGN KEY([categoryid])
REFERENCES [dbo].[category] ([id])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK4ort9abhumpx4t2mlngljr1vi]
GO
